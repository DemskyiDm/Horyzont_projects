var token = "5620142605:AAHaPlIm3xPWuq-vV5Kh1e8IyYHZh6IC4TQ";
        var telegramUrl = "https://api.telegram.org/bot" + token;
        var webAppUrl = "https://script.google.com/macros/s/AKfycbxSCO6m2E2x2upR981wQEPv9oQqkCx14HZBeJIFhG12gFzpdIpm/exec";

        function getMe() {
        var url = telegramUrl + "/getMe";
        var response = UrlFetchApp.fetch(url);
        Logger.log(response.getContentText());

        }

        function setWebhook() {
        var url = telegramUrl + "/setWebhook?url="+webAppUrl;
        var response = UrlFetchApp.fetch(url);
        Logger.log(response.getContentText());

        }


        function doGet(e) {
        return HtmlService.createHtmlOutput("Hi there");
        }
/*
function dePost(e) {
// this is where Telegram works

}
*/

        function doPost(e) {
        // this is where telegram works
        var data = JSON.parse(e.postData.contents);
        // var text = data.message.text;
        // var id = data.message.chat.id;
        // var name = data.message.chat.first_name + " " + data.message.chat.last_name;
        // var answer = "Hi" + name + ", thank for your comment " + text;

        GmailApp.sendEmail(Session.getEffectiveUser().getEmail(),"Message sent to bot", JSON.stringify(data,null,4));

 /* var data = JSON.parse(e.postData.contents);
  var text = data.message.text;
  var id = data.message.chat.id;
  var name = data.message.chat.first_name + " " + data.message.chat.last_name;
  var answer = "Hi " + name + ", thank you for your comment " + text;
  sendText(id,answer);
  SpreadsheetApp.openById(ssId).getSheets()[0].appendRow([new Date(),id,name,text,answer]);

  if(/^@/.test(text)) {
    var sheetName = text.slice(1).split(" ")[0];
    var sheet = SpreadsheetApp.openById(ssId).getSheetByName(sheetName) ? SpreadsheetApp.openById(ssId).getSheetByName(sheetName) : SpreadsheetApp.openById(ssId).insertSheet(sheetName);
    var comment = text.split(" ").slice(1).join(" ");
    sheet.appendRow([new Date(),id,name,comment,answer]);*/


        }