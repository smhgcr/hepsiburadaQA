Feature: Login

  Background:
    Given 'https://giris.hepsiburada.com/' url gidilir
    And email alanı bos


  Scenario: Boş alanlarda hata
    When 'Giris yap' butonuna tıklanır.
    Then 'E-posta adresinizi veya telefon numaranızı girmelisiniz.' hatası

  Scenario: Wrong password
    When Email alanına 'smh_gcr@hotmail.com' yazılır
    And 'Giriş yap' butonuna tıklanır
    And 'Şifre' alanına 'yanlis sifre' yazilir
    Then 'Girdiğiniz şifre eksik veya hatalı. Kontrol edip tekrar deneyin.' hata mesajı görülür.

  Scenario: Başarılı Giriş
    Given Kullanıcı bilgileri:
      | email               | password   |
      | smh_gcr@hotmail.com | dogruSifre |
    When Email alanına 'smh_gcr@hotmail.com' yazılır
    And 'Giriş yap' butonuna tıklanır
    And 'Şifre' alanına 'dogruSifre' yazilir
    And 'Giriş yap' butonuna tıklanır
    Then Başarılı bir şekilde anasayfaya yönlendirildiği görülür.