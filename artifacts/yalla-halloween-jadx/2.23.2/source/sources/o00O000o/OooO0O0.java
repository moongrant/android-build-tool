package o00O000o;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface OooO0O0<T> {
    @NonNull
    T create(@NonNull Context context);

    @NonNull
    List<Class<? extends OooO0O0<?>>> dependencies();
}
