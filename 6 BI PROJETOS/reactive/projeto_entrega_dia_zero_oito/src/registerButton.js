import React from "react";


class RegisterButton extends React.Component {


    render() {

        return (
            <div className="submitButton">
                <button
                    className="registerButtonCss"
                    disabled={this.props.disabled}
                    onClick={() => this.props.onClick()}

                >
                    {this.props.text}

                </button>
            </div>
        );
    }


}

export default RegisterButton;
