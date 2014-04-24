var exec = require('cordova/exec');

module.exports = {

	go: function(location) {
        var _location = (location || "");
        cordova.exec(null, null, "OpenStoreUpdate", "go", [_location]);
    }

};