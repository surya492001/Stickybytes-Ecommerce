import { Alert } from "bootstrap";
import React from "react";

export default function SearchBox({ label, placeholder, value, handleSearch }) {
  return (
    <div className="flex items-center gap-3 pl-4 flex-1font-primary">
      <label className="text-lg font-semibold text-primary dark:text-light">
        {label}
      </label>
      <input
        type="text"
        className="px-4 py-2 text-base border rounded-md transition border-primary  dark:border-light focus:ring-dark:focus:ring-lighter  focus:ring-dark focus:outline-none text-gray-800 dark:text-lighter"
        placeholder={placeholder}
        value={value}
        onChange={(event) => handleSearch(event.target.value)}
      />{" "}
    </div>
  );
}
