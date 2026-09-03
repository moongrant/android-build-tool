package com.yalla.yalla.base.loadcache;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v1 com.yalla.yalla.base.loadcache.LoadCache$Level[], still in use, count: 1, list:
  (r6v1 com.yalla.yalla.base.loadcache.LoadCache$Level[]) from 0x0029: INVOKE (r6v1 com.yalla.yalla.base.loadcache.LoadCache$Level[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:42)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yalla/yalla/base/loadcache/LoadCache$Level", "", "Lcom/yalla/yalla/base/loadcache/LoadCache$Level;", "", "level", "I", "getLevel", "()I", "CACHE", "DISK", "NET", "YLBase_release"}, k = 1, mv = {1, 9, 0})
public final class LoadCache$Level {
    CACHE(1),
    DISK(2),
    NET(3);

    private static final /* synthetic */ EnumEntries $ENTRIES;
    private final int level;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(loadCache$LevelArr);
    }

    public LoadCache$Level(int i) {
        super(str, i);
        this.level = i;
    }

    public static LoadCache$Level valueOf(String str) {
        return (LoadCache$Level) Enum.valueOf(LoadCache$Level.class, str);
    }

    public static LoadCache$Level[] values() {
        return (LoadCache$Level[]) $VALUES.clone();
    }
}
