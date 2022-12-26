[
{
"IndexNo":" 1",
"TestCaseID":"TestCaseId1",
"Description":"Add to List",
"Steps":"click(btnRemoveFromList)::select(cbGrade['C1'])::click(btnAddToList)"
},
{
"IndexNo":" 2",
"TestCaseID":"TestCaseId2",
"Description":"Remove From List",
"Steps":"input(txtName['Ali '])::expect(lstNameGrade['Ali B2'])::expect(lstNameGrade[''])::select(lstNameGrade['Ali B2'])::click(btnRemoveFromList)"
},
{
"IndexNo":" 3",
"TestCaseID":"TestCaseId3",
"Description":"Deny Empty String Add",
"Steps":"input(txtName[''])::click(btnAddToList)::expect(msgBoxErrorText['Please write name and selece grade'])::click(msgBoxErrorBtnOk)"
},
{
"IndexNo":" 4",
"TestCaseID":"TestCaseId4",
"Description":"Deny Empty String Add",
"Steps":"input(txtName[''])::click(btnAddToList)::expect(msgBoxErrorText['Please write name and selece grade'])::click(msgBoxErrorBtnOk)"
}
]

Not:Uygulama Console app olarak tasarlanacak.
1. Yukarıdaki JSON dosyası ekli dosyada bulunmaktadır.
2. Bu  Json Dosyasını parse eden  jsonReadAndParse(String Path) adında bir  method yazılacak.
3.adımdaki tasarladığımı methodu aşağıdaki gibi çağırabilmeliyim.

	List<TestCaseItem> testCaseItems=jsonReadAndParse(jsonPath)

4. Ekli dosyadaki Json ile method  çağrıldıktan  sonra  Tüm testCase property'lerine ayrı ayrı erişip ekrana yazdırabilmeliyim.

Örnek Çktı

Index No--> 1
Test Case ID -->TestCaseId1
Description-->Add to List
Steps-->
	Step-1: Command-->click, locator-->btnRemoveFromList,
	Step-2: Command-->select, locator-->cbGrade, value-->C1
	Step-3: Command-->click, locator-->btnAddToList,
.....
.....
.....
.....
.....
.....
.....
.....


5. Uygulama için aşağıdakine benzer Class yapıları kullanılabilir.

class Step{
	string command;
	string locator;
	string value;
}

class TestCaseItem{
	int index;
	string testCaseId;
	string desc;
	List<Step> steps;
}
a)once :: split ile ayir arraye at
b) ayirdiktan sonraki her bir itemin () arasindakini cek eger () icerisinde [] varsa once icindeki '' cek
