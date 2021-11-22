***CustomItems support has been added for ShopGUI+, I was late archiving this repo but I will do it now***

***DISCALIMER*** *"Oh wow nice job leaking CustomItems plugin"* Stop it, before you even try saying this, the jar included with this source code is publicly available on the CustomItems [Github page](https://github.com/jojodmo/CustomItems/blob/master/API/CustomItemsAPI_PLACEHOLDER.jar) it is simply included with source code to make it easier if someone else wants to make a commit on this.


# How do i use this?

Simple, just add a CustomItem just like you would a regular ShopGUI+ Shop item!

Below is an entire .yml shop file that displays a CustomItem with an ID of `CustomItem`

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
