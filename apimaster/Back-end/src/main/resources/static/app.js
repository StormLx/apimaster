const skillcard = document.getElementById('skillcard');
const BASE_API_URL = 'http://localhost:8080/api';

fetch(`${BASE_API_URL}/skills/all`, {method:"GET"})
    .then(data=> data.json())
    .then(res=> {
        const skillList = res.data.skillList
        skillList.forEach(skill => {
            const _markup = `
                <div class="col">
                    <div class="card mb-3" style="width: 18rem;">
                        <div class="card-header">
                            ${skill.title}
                        </div>
                        <ul class="list-group list-group-flush">
                            <li class="list-group-item">Damage: ${skill.damage}</li>
                            <li class="list-group-item">Range: ${skill.range}</li>
                            <li class="list-group-item">Is a crowd control: ${skill.isCC}</li>
                        </ul>
                    </div>
                </div>
            `
            skillcard.insertAdjacentHTML('afterbegin', _markup);
        })
    })
    .catch(err => console.log(err));

