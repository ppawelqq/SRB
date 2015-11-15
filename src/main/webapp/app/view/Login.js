Ext.define("SRB.view.Login", {
    extend: "Ext.window.Window",
    requires: [
        "SRB.view.Home",
        "SRB.controller.LoginController"
    ],
    views: ["Home"],
    alias: "widget.login",
    autoShow: true,
    height: 170,
    width: 400,
    resizable: false,
    cloasable: false,
    layout: {
        type: "fit"
    },
    title: "Logowanie",
    closeAction: "hide",
    closeable: false,
    initComponent: function () {
        var Login = this;

        Login.username = Ext.create({
            xtype: "textfield",
            fieldLabel: "Login"
        });

        Login.password = Ext.create({
            xtype: "textfield",
            inputType: "password",
            fieldLabel: "Hasło"
        });

        Login.items = [{
                xtype: "panel",
                layout: {
                    type: "vbox",
                    align: "stretch"
                },
                flex: 1,
                items: [
                    Login.username,
                    Login.password
                ]
            }];

        Login.dockedItems = [{
                xtype: "toolbar",
                dock: "bottom",
                items: [{
                        xtype: "tbfill"
                    }, {
                        xtype: "button",
                        text: "Anuluj"
                    }, {
                        xtype: "button",
                        text: "Zaloguj",
                        handler: function () {
                            if (Login.username.getValue() && Login.password.getValue()) {
                                var logParams = {
                                    username: Login.username.getValue(),
                                    password: Login.password.getValue()
                                };
                                SRB.controller.LoginController.log(logParams);
                            }
                        }
                    }]
            }];
        this.callParent(arguments);
    }
});