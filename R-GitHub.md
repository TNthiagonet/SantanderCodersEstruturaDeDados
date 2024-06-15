# GitHub Comandos
- Para subir atualizações
- 
git status

git add .

git commit -m "Subindo alterações do arquivo: "

git push


---------------------------------------

# Criou local e precisa criar o repositorio no GitHub ?

git init

git status

git add .

git commit -m "Primeiro commit"

git config --global user.email "seu-email@exemplo.com"
git config --global user.name "Seu Nome"

curl -u 'SEU_USUARIO' https://api.github.com/user/repos -d '{"name":"NOME_DO_REPOSITORIO"}'

git remote add origin URL_DO_REPOSITORIO_GITHUB.git

git push -u origin master




# Para baixar atualizações online para o local
- 
git pull origin main



