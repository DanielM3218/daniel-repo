//package com.example.pokemon
//
//import org.junit.jupiter.api.Test
//import org.junit.jupiter.api.DisplayName
//import org.springframework.boot.test.context.SpringBootTest
//
//@SpringBootTest
//class PokemonServiceTest {
//    private val pokemonService = PokemonService()
//
//    @Test
//    @DisplayName("Should return all Pokémon")
//    fun getAllPokemonsTest() {
//        // When
//        val result = pokemonService.getAllPokemons()
//
//        // Then
//        assert(result.isNotEmpty())
//        assert(result.size == 2)
//        assert(result[0].name == "Bulbasaur")
//        assert(result[1].name == "Ivysaur")
//    }
//
//    @Test
//    @DisplayName("Should return Pokémon by ID when it exists")
//    fun getPokemonByIdExistingTest() {
//        // When
//        val result = pokemonService.getPokemonById(1)
//
//        // Then
//        assert(result != null)
//        assert(result?.id == 1)
//        assert(result?.name == "Bulbasaur")
//        assert(result?.types == listOf("Grass", "Poison"))
//        assert(result?.pokedexNumber == 1)
//    }
//
//    @Test
//    @DisplayName("Should return null when Pokémon ID doesn't exist")
//    fun getPokemonByIdNonExistingTest() {
//        // When
//        val result = pokemonService.getPokemonById(999)
//
//        // Then
//        assert(result == null)
//    }
//}