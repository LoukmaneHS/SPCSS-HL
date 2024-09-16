setInterval(() => {
    fetch('/server-info')
        .then(response => response.json())
        .then(data => {
            document.getElementById('players').innerText = data.players;
            document.getElementById('avgSkill').innerText = data.avgSkill.toFixed(2);
            document.getElementById('avgPing').innerText = data.avgPing;
            document.getElementById('map').innerText = data.map;
            document.getElementById('location').innerText = data.location;
            document.getElementById('owner').innerText = data.owner;
        })
        .catch(error => console.error('Error fetching server data:', error));
}, 2000);
