Dim message, sapi

message=InputBox("Leia para mim")

Set sapi=CreateObject("sapi.spvoice")

sapi.Speak message