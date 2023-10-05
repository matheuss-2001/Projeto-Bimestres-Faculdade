import 'bootstrap/dist/css/bootstrap.min.css'
import React from 'react'
import ReactDOM from 'react-dom'

class App extends React.Component {

    constructor(props) {
        super(props)
        this.state = {
            latitude: null,
            longitude: null,
            estacao: null,
            data: null,
            icone: null
        }
    }



    render() {


        return (

            <div className="container mt-2">

                <div className="row justify-content-center">

                    <div className="col-md-8">

                        <div className="card">

                            <div className="card-body">

                                <div className="d-flex align-items-center border rounded mb-2"
                                    style={{ height: '6rem' }}>
                              
                                    <i className={`fas fa-5x ${this.state.icone}`}></i>
                                   
                                    <p className=" w-75 ms-3 text-center fs-1">{this.state.estacao}</p>
                                </div>



                            </div>
                        </div>

                    </div>


                </div>
            </div>
        );
    }



    obterLocalizacao = () => {
        window.navigator.geolocation.getCurrentPosition(
            (posicao) => {
                let data = new Date()
                let estacao = this.obterEstacao(data, posicao.coords.latitude);
                let icone = this.icones[estacao]
                console.log(icone)
                this.setState(
                    {
                        latitude: posicao.coords.latitude,
                        longitude: posicao.coords.longitude,
                        estacao: estacao,
                        data: data.toLocaleTimeString(),
                        icone: icone
                    }
                )
            }
        )
    }
    obterEstacao = (data, latitude) => {
        const anoAtual = data.getFullYear()

        const d1 = new Date(anoAtual, 5, 23)

        const d2 = new Date(anoAtual, 8, 24)

        const d3 = new Date(anoAtual, 11, 22)

        const d4 = new Date(anoAtual, 2, 21)

        const sul = latitude < 0;



        switch (data) {

            case data >= d1 && data < d2:
                sul
                    ? 'Inverno'
                    : 'Verão';
                break;

            case data >= d2 && data < d3:
                sul
                    ? 'Primavera'
                    : 'Outono'
                break;

            case data >= d3 || data < d1:
                sul
                    ? 'Verão'
                    : 'Inverno'

                break;

            default:
                sul
                    ? 'Outono'
                    : 'Primavera'
                break;


        }

    }


    icones = {
        'Primavera': 'fa-seedling',
        'Verão': 'fa-umbrella-beach',
        'Outono': 'fa-tree',
        'Inverno': 'fa-snowman'
    }

  


}





ReactDOM.render(
    <App />,
    document.querySelector("#root")
);