import React from "react";

function Bootstrapbutton({ text, type }) {
  return <button className={`btn btn-${type}`}>{text}</button>;
}

export default Bootstrapbutton;
