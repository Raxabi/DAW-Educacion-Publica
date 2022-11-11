const $ = (element) => document.getElementById(element);

const list = $("ejer-list");

for (let i = 1; i <= 6; i++) {
    const listElement = document.createElement("li");
    const anchorElement = document.createElement("a");
    anchorElement.textContent = `Ejercicio${i}`;
    list.appendChild(listElement)
        .appendChild(anchorElement)
    
    listElement.setAttribute("id", "list-element");
    anchorElement.href = `./public/Ejercicio${i}.html`;
    if (i === 4) {
        anchorElement.href = "./public/Ejercicio4/index.html";
    }
}