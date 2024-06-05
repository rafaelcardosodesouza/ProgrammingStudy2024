# Script para remover arquivos listados no .gitignore do índice do Git

# Verifica se o .gitignore existe
if (!(Test-Path .gitignore)) {
    Write-Host ".gitignore não encontrado!"
    exit 1
}

# Percorre cada linha do .gitignore e remove os arquivos correspondentes do índice
Get-Content .gitignore | ForEach-Object {
    $pattern = $_.Trim()
    if ($pattern -and -not $pattern.StartsWith('#')) {
        git rm -r --cached $pattern
    }
}

# Faz o commit das mudanças
git commit -m "Remover arquivos listados no .gitignore"
