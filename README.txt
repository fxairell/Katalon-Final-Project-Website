Disclaimer
Perhatian file ini berisi ringkasan dari file project Katalon pada Folder Final Project1_F.X.
Airell V.S.W._KSAT006ONL013 yang terdapat pada Folder Sesi 11 bagian dari Automation Testing with
Katalon Studio. Adapun ringkasan merupakan deskripsi singkat mengenai hal yang tercantum pada file
excel ScenarioTestDocs-20220706-F.X. Airell Valerio Satrio W (Website).xlsx.

Nama			: F.X. Airell Valerio Satrio Wibowo
Kode Peserta	: KSAT006ONL013
Link Github		: https://github.com/fxairell/BTDP-Automation-Katalon
Ringkasan		:

Sheet yang terdapat dalam file:
- User
- Test Case Branch
- Test Case Flow

Ringkasan:
a) User
	User merupakan sheet yang digunakan untuk melihat berbagai Test Case dengan Test Scenarionya,
dilengkapi dengan Step, Test Data, dan nilai Expected-Actual untuk penentuan Passed, Failed, atau Not
Executed. Functional Test digunakan sebagai pemecah alur Test Case dan membaginya menjadi beberapa
kelompok.
b) Test Case Branch
	Test Case Branch merupakan sheet yang digunakan untuk menjabarkan percabangan skenario yang
digunakan dalam berbagai Test Case. Branch diberi nomor untuk memudahkan menentukan alur dari Test Case.
Total terdapat 75 cabang yang digunakan dalam berbagai Test Case. Test Scenario Branch digunakan untuk
menjabarkan Functional Test dari test web sederhana. Test Case ID dibentuk dari perpaduan singkatan
Test Scenario Branch dan penomoran urut dari alur yang digunakan.
c) Test Case Flow
	Test Case Flow merupakan sheet yang digunakan untuk mendefinisikan alur dari setiap Test Case.
Total terdapat 62 Test Case berbeda beserta alur dan penjabaran Positif atau Negatifnya. Alur juga
dilengkapi dengan Pre Condition untuk mempersingkat penulisan alur Test Case.

Beberapa catatan tambahan:
a) Terdapat permasalahan dalam testing Test Case dengan kode RGS, LGN, dan LGT, dimana seluruh Test
   Case berhubungan dengan fungsional Account. Percobaan manual tanpa automasi menunjukkan website
   terdapat bug-bug, seperti tidak bisa logout.
b) Automasi Test Case tidak bisa seragam pada bagian Test Case dengan kode ISH. Terdapat beberapa
   pengecualian untuk kasus-kasus tertentu, seperti harga terlalu rendah sehingga belum bisa masuk
   untuk threshold pembayaran (check out). Test Case diuji manual dengan hasil Passed, meskipun
   yang terdapat pada hasil report Test Suite menunjukkan kegagalan. Pengecualian lain ada pada
   Test Case nomor 15, dimana element tidak present, namun harus discroll. Pengujian manual juga
   menghasilkan hasil Passed, meskipun hasil report Test Suite menunjukkan kegagalan.
c) Automasi Test Case juga tidak bisa seragam pada bagian Test Case dengan kode PVD. Terdapat satu
   pengecualian yaitu pada kasus LinkAja, yang memiliki alur pembayaran dan bypass yang berbeda.
   Test Case lain menunjukkan respons website yang terlalu lama, atau berhenti sampai di sana saja,
   dalam kata lain fitur belum tersedia.