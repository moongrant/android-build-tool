package p209o00o0oo0;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Pattern f39496OooO0OO = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f39497OooO00o = -1;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f39498OooO0O0 = -1;

    public final boolean OooO00o(String str) {
        Matcher matcher = f39496OooO0OO.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = o0O00.f40595OooO00o;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.f39497OooO00o = i2;
            this.f39498OooO0O0 = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void OooO0O0(Metadata metadata) {
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f12530OooO0Oo;
            if (i >= entryArr.length) {
                return;
            }
            Metadata.Entry entry = entryArr[i];
            if (entry instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entry;
                if ("iTunSMPB".equals(commentFrame.f12587OooO0o) && OooO00o(commentFrame.f12589OooO0oO)) {
                    return;
                }
            } else if (entry instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entry;
                if ("com.apple.iTunes".equals(internalFrame.f12596OooO0o0) && "iTunSMPB".equals(internalFrame.f12595OooO0o) && OooO00o(internalFrame.f12597OooO0oO)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}
