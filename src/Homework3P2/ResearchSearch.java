package Homework3P2;

import java.util.ArrayList;

public class ResearchSearch {
    final String SearchString;
    public ResearchSearch(String sString) {
        SearchString = sString;
    }

    public boolean SearchRTitle(ArrayList<Research> a, ResearchSearch ResearchSearch) {
        for (Research research : a) {
            if (research.ResearchTitle.equalsIgnoreCase(ResearchSearch.SearchString)) {
                return true;
            }
        }
        return false;
    }

    public boolean SearchRAuthor(ArrayList<Research> a, ResearchSearch ResearchSearch) {
        for (Research research : a) {
            if (research.ResearchAuthor.equalsIgnoreCase(ResearchSearch.SearchString)) {
                return true;
            }
        }
        return false;
    }
}
