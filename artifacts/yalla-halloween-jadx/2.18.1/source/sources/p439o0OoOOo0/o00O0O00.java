package p439o0OoOOo0;

import android.os.Handler;
import android.text.TextUtils;
import com.android.billingclient.api.o0OoOo0;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.models.HashtagEntity;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.MentionEntity;
import com.twitter.sdk.android.core.models.SymbolEntity;
import com.twitter.sdk.android.core.models.UrlEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.text.Typography;
import p021OooOooo.oo000o;
import p036OoooOOO.o000000;
import p433o0OoOO0o.o0O000O;
import p433o0OoOO0o.o0O00O;
import p433o0OoOO0o.o0O00OOO;
import p433o0OoOO0o.o0O0O0Oo;
import p433o0OoOO0o.o0O0o;
import p433o0OoOO0o.o0O0oo0o;
import p436o0OoOOOO.o0O00o00;
import p443o0OoOo00.o00Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Handler f40165OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O00OOO<o0O0O0Oo> f40166OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0oo0o f40164OooO00o = o0O0oo0o.OooO0OO();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo000o<Long, p436o0OoOOOO.o0O00OOO> f40167OooO0Oo = new oo000o<>(20);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oo000o<Long, o0000O0> f40168OooO0o0 = new oo000o<>(20);

    public class OooO00o extends o0O0o<p436o0OoOOOO.o0O00OOO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0O0o<p436o0OoOOOO.o0O00OOO> f40169OooO00o;

        public OooO00o(o0O0o<p436o0OoOOOO.o0O00OOO> o0o0o) {
            this.f40169OooO00o = o0o0o;
        }

        @Override // p433o0OoOO0o.o0O0o
        public final void OooO0OO(TwitterException twitterException) {
            this.f40169OooO00o.OooO0OO(twitterException);
        }

        @Override // p433o0OoOO0o.o0O0o
        public final void OooO0Oo(o0O00O<p436o0OoOOOO.o0O00OOO> o0o00o2) {
            p436o0OoOOOO.o0O00OOO o0o00ooo2 = o0o00o2.f39934OooO00o;
            o00O0O00.this.f40167OooO0Oo.put(Long.valueOf(o0o00ooo2.f40002OooO), o0o00ooo2);
            o0O0o<p436o0OoOOOO.o0O00OOO> o0o0o = this.f40169OooO00o;
            if (o0o0o != null) {
                o0o0o.OooO0Oo(new o0O00O<>(o0o00ooo2, o0o00o2.f39935OooO0O0));
            }
        }
    }

    public o00O0O00(Handler handler, o0O00OOO<o0O0O0Oo> o0o00ooo2) {
        this.f40165OooO0O0 = handler;
        this.f40166OooO0OO = o0o00ooo2;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01ca  */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList, java.util.List<o0OoOOo0.o0000O0O>] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.ArrayList, java.util.List<o0OoOOo0.o0000O0O>] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.ArrayList, java.util.List<o0OoOOo0.o0000oo>] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.util.ArrayList, java.util.List<o0OoOOo0.o0000O0O>] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList, java.util.List<o0OoOOo0.o0000O0O>] */
    public final o0000O0 OooO00o(p436o0OoOOOO.o0O00OOO o0o00ooo2) {
        int iIntValue;
        if (o0o00ooo2 == null) {
            return null;
        }
        o0000O0 o0000o1 = this.f40168OooO0o0.get(Long.valueOf(o0o00ooo2.f40002OooO));
        if (o0000o1 != null) {
            return o0000o1;
        }
        o0000O0 o0000o2 = new o0000O0();
        o0O00o00 o0o00o01 = o0o00ooo2.f40006OooO0Oo;
        int i = 0;
        if (o0o00o01 != null) {
            List<UrlEntity> list = o0o00o01.f40037OooO00o;
            if (list != null) {
                for (UrlEntity urlEntity : list) {
                    o0000o2.f40125OooO0O0.add(new o0000O0O(urlEntity.OooO0O0(), urlEntity.OooO00o(), urlEntity.f20010Oooo, urlEntity.f20011Oooo0oO, urlEntity.f20012Oooo0oo));
                }
            }
            List<MediaEntity> list2 = o0o00ooo2.f40006OooO0Oo.f40039OooO0OO;
            if (list2 != null) {
                Iterator<MediaEntity> it = list2.iterator();
                while (it.hasNext()) {
                    o0000o2.f40126OooO0OO.add(new o0000oo(it.next()));
                }
            }
            List<HashtagEntity> list3 = o0o00ooo2.f40006OooO0Oo.f40040OooO0Oo;
            if (list3 != null) {
                for (HashtagEntity hashtagEntity : list3) {
                    String str = String.format(Locale.US, "https://twitter.com/hashtag/%s?ref_src=twsrc%%5Etwitterkit", hashtagEntity.f19987Oooo0oO);
                    int iOooO0O0 = hashtagEntity.OooO0O0();
                    int iOooO00o = hashtagEntity.OooO00o();
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("#");
                    sbOooO0o0.append(hashtagEntity.f19987Oooo0oO);
                    o0000o2.f40127OooO0Oo.add(new o0000O0O(iOooO0O0, iOooO00o, sbOooO0o0.toString(), str, str));
                }
            }
            List<MentionEntity> list4 = o0o00ooo2.f40006OooO0Oo.f40038OooO0O0;
            if (list4 != null) {
                for (MentionEntity mentionEntity : list4) {
                    String strOooO00o = o0OoOo0.OooO00o(mentionEntity.f20008OoooO00);
                    int iOooO0O1 = mentionEntity.OooO0O0();
                    int iOooO00o2 = mentionEntity.OooO00o();
                    StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("@");
                    sbOooO0o1.append(mentionEntity.f20008OoooO00);
                    o0000o2.f40129OooO0o0.add(new o0000O0O(iOooO0O1, iOooO00o2, sbOooO0o1.toString(), strOooO00o, strOooO00o));
                }
            }
            List<SymbolEntity> list5 = o0o00ooo2.f40006OooO0Oo.f40041OooO0o0;
            if (list5 != null) {
                for (SymbolEntity symbolEntity : list5) {
                    String str2 = String.format(Locale.US, "https://twitter.com/search?q=%%24%s&ref_src=twsrc%%5Etwitterkit", symbolEntity.f20009Oooo0oO);
                    int iOooO0O2 = symbolEntity.OooO0O0();
                    int iOooO00o3 = symbolEntity.OooO00o();
                    StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0("$");
                    sbOooO0o2.append(symbolEntity.f20009Oooo0oO);
                    o0000o2.f40128OooO0o.add(new o0000O0O(iOooO0O2, iOooO00o3, sbOooO0o2.toString(), str2, str2));
                }
            }
        }
        if (!TextUtils.isEmpty(o0o00ooo2.f40028OooOoOO)) {
            o00Ooo o00ooo2 = o00Ooo.f40231OooO0O0;
            String str3 = o0o00ooo2.f40028OooOoOO;
            Objects.requireNonNull(o00ooo2);
            int length = str3.length();
            StringBuilder sb = new StringBuilder(length);
            ArrayList arrayList = new ArrayList(5);
            int i2 = 0;
            while (i2 < length) {
                char cCharAt = str3.charAt(i2);
                if (cCharAt == '&') {
                    int i3 = i2 + 1;
                    int iIndexOf = str3.indexOf(59, i3);
                    if (iIndexOf == -1) {
                        sb.append(cCharAt);
                    } else {
                        String strSubstring = str3.substring(i3, iIndexOf);
                        int length2 = strSubstring.length();
                        if (length2 <= 0) {
                            iIntValue = -1;
                        } else if (strSubstring.charAt(i) != '#' || length2 <= 1) {
                            Object obj = o00ooo2.f40235OooO00o.f40236OooO00o.get(strSubstring);
                            if (obj == null) {
                                iIntValue = -1;
                            } else {
                                iIntValue = ((Integer) obj).intValue();
                            }
                        } else {
                            char cCharAt2 = strSubstring.charAt(1);
                            if (cCharAt2 != 'x' && cCharAt2 != 'X') {
                                try {
                                    iIntValue = Integer.parseInt(strSubstring.substring(1));
                                } catch (Exception unused) {
                                    iIntValue = -1;
                                }
                            } else if (length2 > 2) {
                                iIntValue = Integer.valueOf(strSubstring.substring(2), 16).intValue();
                            } else {
                                iIntValue = -1;
                            }
                        }
                        if (iIntValue == -1) {
                            sb.append(Typography.amp);
                            if (strSubstring.indexOf(38) == -1) {
                                sb.append(strSubstring);
                                sb.append(';');
                            }
                        } else {
                            sb.append((char) iIntValue);
                            arrayList.add(new int[]{i2, iIndexOf});
                        }
                        i2 = iIndexOf;
                    }
                } else {
                    sb.append(cCharAt);
                }
                i2++;
                i = 0;
            }
            StringBuilder sb2 = new StringBuilder(sb.toString());
            o000000.OooO0o(o0000o2.f40125OooO0O0, arrayList);
            o000000.OooO0o(o0000o2.f40126OooO0OO, arrayList);
            o000000.OooO0o(o0000o2.f40127OooO0Oo, arrayList);
            o000000.OooO0o(o0000o2.f40129OooO0o0, arrayList);
            o000000.OooO0o(o0000o2.f40128OooO0o, arrayList);
            ArrayList arrayList2 = new ArrayList();
            int length3 = sb2.length() - 1;
            for (int i4 = 0; i4 < length3; i4++) {
                if (Character.isHighSurrogate(sb2.charAt(i4)) && Character.isLowSurrogate(sb2.charAt(i4 + 1))) {
                    arrayList2.add(Integer.valueOf(i4));
                }
            }
            o000000.OooO0o0(o0000o2.f40125OooO0O0, arrayList2);
            o000000.OooO0o0(o0000o2.f40126OooO0OO, arrayList2);
            o000000.OooO0o0(o0000o2.f40127OooO0Oo, arrayList2);
            o000000.OooO0o0(o0000o2.f40129OooO0o0, arrayList2);
            o000000.OooO0o0(o0000o2.f40128OooO0o, arrayList2);
            o0000o2.f40124OooO00o = sb2.toString();
        }
        if (!TextUtils.isEmpty(o0000o2.f40124OooO00o)) {
            this.f40168OooO0o0.put(Long.valueOf(o0o00ooo2.f40002OooO), o0000o2);
        }
        return o0000o2;
    }

    public final void OooO0O0(o0O0o<o0O0O0Oo> o0o0o) {
        o0O0O0Oo o0o0o0oo = (o0O0O0Oo) ((o0O000O) this.f40166OooO0OO).OooO0OO();
        if (o0o0o0oo == null) {
            o0o0o.OooO0OO(new TwitterAuthException("User authorization required"));
        } else {
            o0o0o.OooO0Oo(new o0O00O<>(o0o0o0oo, null));
        }
    }
}
