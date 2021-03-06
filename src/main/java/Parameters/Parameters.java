package Parameters;

/**
 * Created by Mikolaj Wawrzyniak
 */
public interface Parameters<T> {
    /**
     * Sanitizes the request url.
     * It has to be called before a new different request should be called.
     */
    public T build();

    /**
     * Items per page with maximum of 40, default 20.
     * @param num
     */
    public T perPage(int num);

    public T pageOfResults(int pages);

    /**
     * Game slug such as [league]-[year]-[team1 3 letter short]-[team2 3 letter short]-[year]-[month]-[day]-[hour hhmm] for [team1] vs [team2]
     * @param gameId
     */
    public T game_id(String gameId);

    /**
     * Player slug such as mlb-david-ortiz for David Ortiz
     * @param playerId
     */
    public T player_id(String playerId);

    /**
     * Team slug such as mlb-kc for the Kansas City Royals
     * @param team_id
     */
    public T team_id(String team_id);

    /**
     * Season slug such as mlb-2016
     * @param seasonId
     */
    public T season_id(String seasonId);

    /**
     * Friendly date such as today or tomorrow; or a timestamp; or a date such as 2016-05-22
     * @param date
     */
    public T on(String date);

    /**
     * Friendly date such as 1 week ago or 4 days ago or last Sunday; or a timestamp such as 1448820000
     * @param date
     */
    public T since(String date);

    /**
     * Feats have levels 0 to 5 where 0 is typical and 3 is rare and 5 is new record
     * @param level
     */
    public T level(int level);

    /**
     * The stat name for the feat
     * @param name
     */
    public T name(String name);
}
