package br.alvaro;

import br.alvaro.models.Kanji;
import br.alvaro.repository.KanjiRepository;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import javax.inject.Inject;
import java.util.List;

@GraphQLApi
public class KanjiResource {

    @Inject
    KanjiRepository repository;

    @Query("allKanjis")
    @Description("Get all Kanjis from N5")
    public List<Kanji> getAllKanjis() {
        return (List<Kanji>) repository.findAll();
    }

    @Query("kanjiByIdeograma")
    @Description("Get all Kanjis from N5 by Kanji")
    public Kanji getByIdeograma(String ideograma) {
        if (repository.findById(ideograma).isPresent())
            return  repository.findById(ideograma).get();
        return null;
    }
}