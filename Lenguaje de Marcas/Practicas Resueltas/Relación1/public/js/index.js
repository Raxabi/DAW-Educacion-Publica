const $ = (element) => document.getElementById(element);
const create = (element) => document.createElement(element);

const ulList = $("un-list");

for (let i = 1; i < 12; i++) {
    const listElement = create("li");
    const anchorListElement = create("a");
    ulList.appendChild(listElement).appendChild(anchorListElement);
    anchorListElement.textContent = `Ejercicio ${i}`;
    listElement.setAttribute("id", "listElement")
    anchorListElement.setAttribute("href", `./public/Ejercicio${i}.html`);
};