Ext.application({
    requires: ["SRB.view.Login", "SRB.view.Home"],
    views: [
        "Login",
        "Home"
    ],
    name: "SRB",
    init: function () {
        var splashscreen = Ext.getBody().mask("Loading...", splashscreen);
        var task = new Ext.util.DelayedTask(function () {
            splashscreen.fadeOut({
                duration: 1000,
                remove: true
            });
            splashscreen.next().fadeOut({
                duration: 1000,
                remove: true,
                listeners: {
                    afteranimate: function (el, startTime, elOpts) {
                        Ext.widget("login");
                    }
                }
            });
        });
        task.delay(2000);
    }
});
