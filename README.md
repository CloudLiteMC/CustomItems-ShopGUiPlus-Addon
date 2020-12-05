***DISCALIMER*** *"Oh wow nice job leaking CustomItems plugin"* Stop it, before you even try saying this, the jar included with this source code is publicly available on the CustomItems [Github page](https://github.com/jojodmo/CustomItems/blob/master/API/CustomItemsAPI_PLACEHOLDER.jar) it is simply included with source code to make it easier if someone else wants to make a commit on this.

***DISCLAIMER PT 2*** This is only a ***TEMPORARY*** fix! The developer of ShopGUI+ Does intend to add CustomItem's functionality; but for now this is a viable option as 
uses ShopGUI+'s ItemProvider class@


# How do i use this?

Simple, just add a customitem just like you would a regular item!

Below is an entire .yml shop file that displays a custom item with an ID of `CustomItem`

```yml
custom_item_shop:
  name: "&a&lCustom Item Shop &c# %page%"
  fillItem:
    material: LIME_STAINED_GLASS_PANE
    name: " "
  items:
    1:
      type: item
      item:
        customItemsId: "CustomItem"
        quantity: 1
      buyPrice: 2.50
      sellPrice: 2.50
      slot: 10
```
