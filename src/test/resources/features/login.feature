Feature: Login functionality

  Scenario: Login dengan data valid
    Given saya membuka halaman login
    When saya memasukkan username "standard_user" dan password "secret_sauce"
    And saya klik tombol login
    Then saya berhasil login ke dashboard

  Scenario: Login dengan password salah
    Given saya membuka halaman login
    When saya memasukkan username "standard_user" dan password "wrongpass"
    And saya klik tombol login
    Then saya melihat pesan error

  Scenario: Login dengan username kosong
    Given saya membuka halaman login
    When saya memasukkan username "" dan password "secret_sauce"
    And saya klik tombol login
    Then saya melihat pesan error