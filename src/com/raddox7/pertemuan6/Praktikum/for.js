// For i (basic)
for(var i=1; i<=25; i++)
    console.log("Loading " + (i*4) + "%")
console.log()


// For in (object)
var obj_demo = [{name: "RaddOx7", yr_assigned: 2099,}, {name: "Retribution.77", yr_assigned: 2027}]

for(var x in obj_demo) {
    console.log("AGENT INFO")
    console.log("Agent name\t: " + obj_demo[x].name)
    console.log("Agent ID\t: " + obj_demo[x].yr_assigned)
    console.log()
}


// For of (array)
var buah2an = ["Apel", "Jeruk", "Pisang"]

for(var buah of buah2an)
    console.log(buah)