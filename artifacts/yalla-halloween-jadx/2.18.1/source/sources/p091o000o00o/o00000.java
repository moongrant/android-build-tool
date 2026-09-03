package p091o000o00o;

import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class o00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @VisibleForTesting
    public final Set<LiveData> f29118OooO00o = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final RoomDatabase f29119OooO0O0;

    public o00000(RoomDatabase roomDatabase) {
        this.f29119OooO0O0 = roomDatabase;
    }
}
