Feature: Compras 


  Scenario: Se requiere realizar compras en la pagina de Plaza

    Given Que estoy en plaza.com
    When Realizo la compra de producto con los siguientes datos
    |Producto|Valor|
    |Tv|699.00|
    Then Estoy en la pagina para confirmar datos 

 