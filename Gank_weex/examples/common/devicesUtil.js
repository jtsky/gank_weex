exports.getDevices =  function getDevices(config){
    var devices = {
        width : config.env.deviceWidth,
        height : config.env.deviceHeight
    };
     return devices;
}
