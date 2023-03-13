chrome.contextMenus.create({
    "id" :"translate",
    "title" : "翻译",
    "contexts": ['selection'],
    "type":"normal"
});
chrome.contextMenus.create({
    "id" :"addNewWord",
    "title" : "添加到生词本",
    "contexts": ['selection'],
    "type":"normal"
});

chrome.contextMenus.onClicked.addListener(function(info, tab) {
    console.log("点击")
    if (info.menuItemId === "translate") {
        console.log("translate")
    }
    else if (info.menuItemId === "addNewWord") { // here's where you'll need the ID
        // do something
        console.log("addNewWord")

    }

});