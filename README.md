# HAPPY BIRTDAY APP - Android Kotlin 🎉🎂

## Cartão de aniversário personalizável - Uma releitura do curso Básico "User Interface" da Udacity
---
## 📱 Projeto

> O app apresenta um cartão de aniversário editável conforme imagens abaixo:

![image](https://user-images.githubusercontent.com/89861753/164293652-f3f9682b-195d-486e-a0e5-21e5921757d1.png)
![image](https://user-images.githubusercontent.com/89861753/164293663-74e17ae8-bf99-4341-ae0c-af9b71721182.png)
![image](https://user-images.githubusercontent.com/89861753/164293672-ebf95da5-58ef-4952-8d57-f1b10e6bfc96.png)

> Para esse projeto de estudos foram utilizadas **duas Activities** sendo a primeira uma tela com **dois EditTexts** baseados no **Material Design** do google. Após o preenchimento dos campos um botão localizado na parte inferior leva o usuário para a próxima Activity, substituindo a TextView pelo nome do aniversariante e pelo nome de quem está enviando o cartão.

> Para agregar valor ao estudo optei por implementar a vinculação de visualização ou **ViewBinding**.<p> Os textos do xml foram extraídos para o arquivo de **strings.xml** para futuras traduções ou alterações.<p> Os **ícones** do app foram alterados e ícones de orientação foram adicionados nos campos digitáveis.<p> Uma **função** para impedir que o usuário gere um cartão sem destinatário ou remetente foi implementada no código em Kotlin e uma mensagem do tipo **Toast** é gerada informando que os campos precisam ser preenchidos.<p> Há uma **restrição da quantidade de caracteres** que podem ser digitados no EditText, essa informação fica visível ao usuário.<p> Uma mensagem do tipo **HelperText** informa a obrigatoriedade dos campos.<p> O **teclado reajusta** a tela de forma que a informação do layout não seja perdida.

## 💻 Tecnologias Utilizadas durante o aprendizado:

- xml: Sintaxe Básica
- Organização das activities em Constraint Layout e Linear Layout
- Utilização de Intent para vincular duas activitys
- Material Design - Implementação de EditTexts amigáveis ao usuário
- Implementação do windowsSoftImputMode para que o teclado não atrapalhe a visualização da tela
- ViewBinding - implementação da vinculação de visualização seguindo as boas práticas
- Criação de um botão com função de chamar uma nova activity, capturar o texto digitado e atribui-lo a nova activity
- Implementação e alteração de ícones no app
- Extração dos textos das activities para o arquivo de strings.xml conforme recomendação de boas práticas
