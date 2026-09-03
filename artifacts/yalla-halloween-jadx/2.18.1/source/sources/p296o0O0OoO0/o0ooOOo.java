package p296o0O0OoO0;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Pattern f35936OooO0OO = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f35937OooO00o = -1;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f35938OooO0O0 = -1;

    public final boolean OooO00o(String str) {
        Matcher matcher = f35936OooO0OO.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = o000OOo0.f36740OooO00o;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.f35937OooO00o = i2;
            this.f35938OooO0O0 = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean OooO0O0(Metadata metadata) {
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f14442Oooo0o;
            if (i >= entryArr.length) {
                return false;
            }
            Metadata.Entry entry = entryArr[i];
            if (entry instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entry;
                if ("iTunSMPB".equals(commentFrame.f14501Oooo0oo) && OooO00o(commentFrame.f14499Oooo)) {
                    return true;
                }
            } else if (entry instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entry;
                if ("com.apple.iTunes".equals(internalFrame.f14508Oooo0oO) && "iTunSMPB".equals(internalFrame.f14509Oooo0oo) && OooO00o(internalFrame.f14507Oooo)) {
                    return true;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}
