package o0OoO;

import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends Lambda implements Function2<Map.Entry<? extends String, ? extends String>, Map.Entry<? extends String, ? extends String>, Integer> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO f46605OooO0Oo = new OooO();

    public OooO() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(Map.Entry<? extends String, ? extends String> entry, Map.Entry<? extends String, ? extends String> entry2) {
        return Integer.valueOf(entry.getKey().compareTo(entry2.getKey()));
    }
}
