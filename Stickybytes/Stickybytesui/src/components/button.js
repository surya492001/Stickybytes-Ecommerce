import styled from "styled-components";
const button = styled.button`
  background-color: ${(props) =>
    props.$primary ? "#4CAF50" : "#008CBA"};
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;

  &:hover {
    background-color: ${(props) =>
      props.$primary ? "#45a049" : "#007bb5"};
  }

  $:focus {
    outline: 2px solid  white;
  }
`;
export default button;