# TextTable
In short TextTable is a tool to convert table data into plain text and vice versa and offers the ability to perform simple sql operations on the table data given.
## Motivation
Although there are a plenty of modern file fomats available which should be considered for new development, plain text file are around always. I'd to deal with them during my time in warehousing and business intelligence very often as many leagacy prefered this file format. Once automated processing was set up dealing with them was easy. But to analyse them in first touch, or to fix data errors with the first data delivery was a mess, tidous and boring coding very often.
I was looking for a code editor which could treat the text files like plain text and as a table also. As I couldn't found one with staisfing feature for this case I wrote my own.


## UI Overview
The UI consists of three basic views. The text view which show the text representation (1). The structure description which explains haw the raw text is translated into table data (2). And the table data of the text (3).
![overview](https://raw.githubusercontent.com/franzreitmayer/TextTable/media/media/overview.png)

## Text View
The text view contains the raw text data which is processed. The text view can by populated by copy and paste or by opening a file via the menu.
![textview](https://raw.githubusercontent.com/franzreitmayer/TextTable/media/media/text-view01.png)

![statement](https://raw.githubusercontent.com/franzreitmayer/TextTable/media/media/statement.png)