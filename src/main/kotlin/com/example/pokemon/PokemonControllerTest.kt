//package com.example.pokemon
//
//import org.junit.jupiter.api.Test
//import org.junit.jupiter.api.DisplayName
//import org.junit.jupiter.api.Nested
//import org.junit.jupiter.api.extension.ExtendWith
//import org.mockito.InjectMocks
//import org.mockito.Mock
//import org.mockito.Mockito.`when`
//import org.mockito.junit.jupiter.MockitoExtension
//import org.springframework.http.HttpStatus
//
//
//@ExtendWith(MockitoExtension::class)
//class PokemonControllerTest {
//    @Mock
//    private lateinit var pokemonService: PokemonService
//
//    @InjectMocks
//    private lateinit var pokemonController: PokemonController
//
//    @Nested
//    @DisplayName("listAllPokemons tests")
//    inner class ListAllPokemonsTests {
//
//        @Test
//        @DisplayName("Should return all Pokémon")
//        fun listAllPokemonsTest() {
//            // Given
//            val expectedPokemons = listOf(
//                Pokemon(1, "Bulbasaur", listOf("Grass", "Poison"), 1, "https://img.pokemondb.net/artwork/large/bulbasaur.jpg"),
//                Pokemon(2, "Ivysaur", listOf("Grass", "Poison"), 2, "https://img.pokemondb.net/artwork/large/ivysaur.jpg")
//            )
//            `when`(pokemonService.getAllPokemons()).thenReturn(expectedPokemons)
//
//            // When
//            val result = pokemonController.listAllPokemons()
//
//            // Then
//            assert(result.isNotEmpty())
//            assert(result.size == 2)
//            assert(result == expectedPokemons)
//        }
//    }
//
//    @Nested
//    @DisplayName("getPokemonById tests")
//    inner class GetPokemonByIdTests {
//
//        @Test
//        @DisplayName("Should return Pokémon when ID exists")
//        fun getPokemonByIdExistingTest() {
//            // Given
//            val expectedPokemon = Pokemon(1, "Bulbasaur", listOf("Grass", "Poison"), 1, "https://img.pokemondb.net/artwork/large/bulbasaur.jpg")
//            `when`(pokemonService.getPokemonById(1)).thenReturn(expectedPokemon)
//
//            // When
//            val responseEntity = pokemonController.getPokemonById(1)
//
//            // Then
//            assert(responseEntity.statusCode == HttpStatus.OK)
//            assert(responseEntity.body == expectedPokemon)
//        }
//
//        @Test
//        @DisplayName("Should return 404 NOT FOUND when Pokémon ID doesn't exist")
//        fun getPokemonByIdNonExistingTest() {
//            // Given
//            `when`(pokemonService.getPokemonById(999)).thenReturn(null)
//
//            // When
//            val responseEntity = pokemonController.getPokemonById(999)
//
//            // Then
//            assert(responseEntity.statusCode == HttpStatus.NOT_FOUND)
//            assert(responseEntity.body == null)
//        }
//    }
//}