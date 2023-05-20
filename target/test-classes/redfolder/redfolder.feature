Feature: This is confact page functionality



Scenario: verify user can contact by sending message
Given openn demoblaze "<URL>" app
Then  clickk contact link
Then  enter contact email
Then  enter contact name
Then  enter contact message
Then  click send message
Then  verify user can contact successfully by sending message