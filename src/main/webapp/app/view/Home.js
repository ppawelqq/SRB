Ext.define("SRB.view.Home", {
    extend: "Ext.panel.Panel",
    alias: "widget.home",
    title: "Home",
    layout: {
        type: "vbox",
        align: "stretch"
    },
    plugins: "viewport",
    initComponent: function() {
        var Home = this;
        console.log("initCompoennet");
        Home.panel = Ext.create({
            xtype: "panel",
            title: "test",
            flex: 100
        });
        
        Home.items = [Home.panel];
        this.callParent(arguments);
    }
});