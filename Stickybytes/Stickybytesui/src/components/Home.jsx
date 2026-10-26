import PageHeading from "./PageHeading";
import ProductListing from "./ProductListing";
import apiClient from "../API/apiClient";
import { useState, useEffect } from "react";
import { useLoaderData, useLocation } from "react-router-dom";

export default function Home() {
  const products = useLoaderData();

  // Normal UI
  return (
    <div className="max-w-[1152px] mx-auto px-6 py-8">
      <PageHeading title="Explore Stickybyte Stickers!">
        Add a touch of creativity to your space with our wide range of fun and
        unique stickers. Perfect for any occasion!
      </PageHeading>

      <ProductListing products={products} />
    </div>
  );
}

export async function productsloader() {
  try {
    const response = await apiClient.get("/products");
    return response.data;
  } catch (error) {
    throw new Response(
      error.response?.data?.errorMessage ||
        errorMessage ||
        "Failed to fetch products Pleasse try again later.",
      { status: error.response?.status || 500 },
    );
  }
}
