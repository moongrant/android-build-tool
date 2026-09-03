package p096o000o0o;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface o00oO0o<T> {
    @NonNull
    T create(@NonNull Context context);

    @NonNull
    List<Class<? extends o00oO0o<?>>> dependencies();
}
