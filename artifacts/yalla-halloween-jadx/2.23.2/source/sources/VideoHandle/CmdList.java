package VideoHandle;

import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class CmdList extends ArrayList<String> {
    public final void OooO0O0(String str) {
        for (String str2 : str.split(ZegoConstants.ZegoVideoDataAuxPublishingStream)) {
            if (!str2.replace(ZegoConstants.ZegoVideoDataAuxPublishingStream, "").equals("")) {
                add(str2);
            }
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this) {
            sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sb.append(str);
        }
        return sb.toString();
    }
}
