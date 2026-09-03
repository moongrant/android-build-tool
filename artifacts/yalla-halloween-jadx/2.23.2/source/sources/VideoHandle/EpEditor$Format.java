package VideoHandle;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v2 VideoHandle.EpEditor$Format[], still in use, count: 1, list:
  (r3v2 VideoHandle.EpEditor$Format[]) from 0x001d: INVOKE (r3v2 VideoHandle.EpEditor$Format[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:30)
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
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"VideoHandle/EpEditor$Format", "", "LVideoHandle/EpEditor$Format;", "MP3", "MP4", "FFmpegLib_release"}, k = 1, mv = {1, 9, 0})
public final class EpEditor$Format {
    MP3,
    MP4;

    private static final /* synthetic */ EnumEntries $ENTRIES;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(epEditor$FormatArr);
    }

    public EpEditor$Format() {
        super(str, i);
    }

    public static EpEditor$Format valueOf(String str) {
        return (EpEditor$Format) Enum.valueOf(EpEditor$Format.class, str);
    }

    public static EpEditor$Format[] values() {
        return (EpEditor$Format[]) $VALUES.clone();
    }
}
