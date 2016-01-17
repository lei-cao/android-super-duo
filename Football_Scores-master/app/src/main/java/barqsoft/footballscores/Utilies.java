package barqsoft.footballscores;

import android.content.Context;

/**
 * Created by yehya khaled on 3/3/2015.
 */
public class Utilies
{
    private Context context;
    public static final int SERIE_A = 357;
    public static final int PREMIER_LEGAUE = 354;
    public static final int CHAMPIONS_LEAGUE = 362;
    public static final int PRIMERA_DIVISION = 358;
    public static final int BUNDESLIGA = 351;

    public Utilies(Context current){
        this.context = current;
    }
    
    public String getLeague(int league_num)
    {
        switch (league_num)
        {
            case SERIE_A : return context.getResources().getString(R.string.term_serie_a);
            case PREMIER_LEGAUE : return context.getResources().getString(R.string.term_premier_league);
            case CHAMPIONS_LEAGUE : return context.getResources().getString(R.string.term_champions_league);
            case PRIMERA_DIVISION : return context.getResources().getString(R.string.term_primera_division);
            case BUNDESLIGA : return context.getResources().getString(R.string.term_bundesliga);
            default: return context.getResources().getString(R.string.term_unknown_league);
        }
    }
    public String getMatchDay(int match_day,int league_num)
    {
        if(league_num == CHAMPIONS_LEAGUE)
        {
            if (match_day <= 6)
            {
                return context.getResources().getString(R.string.term_group_stages);
            }
            else if(match_day == 7 || match_day == 8)
            {
                return context.getResources().getString(R.string.term_first_knockout_round);
            }
            else if(match_day == 9 || match_day == 10)
            {
                return context.getResources().getString(R.string.term_quarter_final);
            }
            else if(match_day == 11 || match_day == 12)
            {
                return context.getResources().getString(R.string.term_semi_final);
            }
            else
            {
                return context.getResources().getString(R.string.term_final);
            }
        }
        else
        {
            return context.getResources().getString(R.string.term_match_day) + String.valueOf(match_day);
        }
    }

    public String getScores(int home_goals,int awaygoals)
    {
        if(home_goals < 0 || awaygoals < 0)
        {
            return context.getResources().getString(R.string.term_score_separater);
        }
        else
        {
            return String.valueOf(home_goals) + context.getResources().getString(R.string.term_score_separater) + String.valueOf(awaygoals);
        }
    }

    public int getTeamCrestByTeamName (String teamname)
    {
        if (teamname==null){return R.drawable.no_icon;}
        if (teamname.equals(context.getResources().getString(R.string.term_team_arsenal))) {
            return R.drawable.arsenal;
        } else if (teamname.equals(context.getResources().getString(R.string.term_team_manchester_united))) {
            return R.drawable.manchester_united;
        } else if (teamname.equals(context.getResources().getString(R.string.term_team_swansea))) {
            return R.drawable.swansea_city_afc;
        } else if (teamname.equals(context.getResources().getString(R.string.term_team_leicester))) {
            return R.drawable.leicester_city_fc_hd_logo;
        } else if (teamname.equals(context.getResources().getString(R.string.term_team_everton))) {
            return R.drawable.everton_fc_logo1;
        } else if (teamname.equals(context.getResources().getString(R.string.term_team_west_ham))) {
            return R.drawable.west_ham;
        } else if (teamname.equals(context.getResources().getString(R.string.term_team_tottenham))) {
            return R.drawable.tottenham_hotspur;
        } else if (teamname.equals(context.getResources().getString(R.string.term_team_west_bromwich))) {
            return R.drawable.west_bromwich_albion_hd_logo;
        } else if (teamname.equals(context.getResources().getString(R.string.term_team_sunderland))) {
            return R.drawable.sunderland;
        } else if (teamname.equals(context.getResources().getString(R.string.term_team_stock))) {
            return R.drawable.stoke_city;
        } else {
            return R.drawable.no_icon;
        }
    }
}
