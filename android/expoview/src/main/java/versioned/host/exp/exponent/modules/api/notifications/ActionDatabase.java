package versioned.host.exp.exponent.modules.api.notifications;

import com.raizlabs.android.dbflow.annotation.Database;

@Database(name = ActionDatabase.NAME, version = ActionDatabase.VERSION)
public class ActionDatabase {

  public static final String NAME = "Colonies";

  public static final int VERSION = 1;
}