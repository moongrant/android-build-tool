package o000OOoO;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Pattern f34717OooO0OO = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f34718OooO00o = -1;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f34719OooO0O0 = -1;

    public final boolean OooO00o(String str) {
        Matcher matcher = f34717OooO0OO.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = o00.f34910OooO00o;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.f34718OooO00o = i2;
            this.f34719OooO0O0 = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void OooO0O0(Metadata metadata) {
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f6336OooO0Oo;
            if (i >= entryArr.length) {
                return;
            }
            Metadata.Entry entry = entryArr[i];
            if (entry instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entry;
                if ("iTunSMPB".equals(commentFrame.f8466OooO0o) && OooO00o(commentFrame.f8468OooO0oO)) {
                    return;
                }
            } else if (entry instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entry;
                if ("com.apple.iTunes".equals(internalFrame.f8475OooO0o0) && "iTunSMPB".equals(internalFrame.f8474OooO0o) && OooO00o(internalFrame.f8476OooO0oO)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}
