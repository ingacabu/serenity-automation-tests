Feature: Send Practice Form.
  I as user I wana go in to the web page demoQA and send the practice form.
    Scenario: Send Practice Form success.
      Given that the user open the demoQA play and select forms
      When the user fill the form and send
      Then the user could view the information