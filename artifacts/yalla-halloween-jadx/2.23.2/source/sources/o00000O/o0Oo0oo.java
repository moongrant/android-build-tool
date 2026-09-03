package o00000O;

import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final CharSequence f33452OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final IconCompat f33453OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f33454OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String f33455OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f33456OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f33457OooO0o0;

    @RequiresApi(28)
    public static class OooO00o {
        @DoNotInline
        public static o0Oo0oo OooO00o(Person person) {
            IconCompat iconCompat;
            OooO0O0 oooO0O0 = new OooO0O0();
            oooO0O0.f33458OooO00o = person.getName();
            IconCompat iconCompatOooO0OO = null;
            if (person.getIcon() != null) {
                Icon icon = person.getIcon();
                PorterDuff.Mode mode = IconCompat.f5309OooOO0O;
                icon.getClass();
                int iOooO0OO = IconCompat.OooO00o.OooO0OO(icon);
                if (iOooO0OO != 2) {
                    if (iOooO0OO == 4) {
                        Uri uriOooO0Oo = IconCompat.OooO00o.OooO0Oo(icon);
                        uriOooO0Oo.getClass();
                        String string = uriOooO0Oo.toString();
                        string.getClass();
                        iconCompat = new IconCompat(4);
                        iconCompat.f5312OooO0O0 = string;
                    } else if (iOooO0OO != 6) {
                        iconCompatOooO0OO = new IconCompat(-1);
                        iconCompatOooO0OO.f5312OooO0O0 = icon;
                    } else {
                        Uri uriOooO0Oo2 = IconCompat.OooO00o.OooO0Oo(icon);
                        uriOooO0Oo2.getClass();
                        String string2 = uriOooO0Oo2.toString();
                        string2.getClass();
                        iconCompat = new IconCompat(6);
                        iconCompat.f5312OooO0O0 = string2;
                    }
                    iconCompatOooO0OO = iconCompat;
                } else {
                    iconCompatOooO0OO = IconCompat.OooO0OO(null, IconCompat.OooO00o.OooO0O0(icon), IconCompat.OooO00o.OooO00o(icon));
                }
            }
            oooO0O0.f33459OooO0O0 = iconCompatOooO0OO;
            oooO0O0.f33460OooO0OO = person.getUri();
            oooO0O0.f33461OooO0Oo = person.getKey();
            oooO0O0.f33463OooO0o0 = person.isBot();
            oooO0O0.f33462OooO0o = person.isImportant();
            return new o0Oo0oo(oooO0O0);
        }

        @DoNotInline
        public static Person OooO0O0(o0Oo0oo o0oo0oo2) {
            Person.Builder name = new Person.Builder().setName(o0oo0oo2.f33452OooO00o);
            Icon iconOooO0o = null;
            IconCompat iconCompat = o0oo0oo2.f33453OooO0O0;
            if (iconCompat != null) {
                iconCompat.getClass();
                iconOooO0o = IconCompat.OooO00o.OooO0o(iconCompat, null);
            }
            return name.setIcon(iconOooO0o).setUri(o0oo0oo2.f33454OooO0OO).setKey(o0oo0oo2.f33455OooO0Oo).setBot(o0oo0oo2.f33457OooO0o0).setImportant(o0oo0oo2.f33456OooO0o).build();
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public CharSequence f33458OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public IconCompat f33459OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public String f33460OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public String f33461OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f33462OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f33463OooO0o0;
    }

    public o0Oo0oo(OooO0O0 oooO0O0) {
        this.f33452OooO00o = oooO0O0.f33458OooO00o;
        this.f33453OooO0O0 = oooO0O0.f33459OooO0O0;
        this.f33454OooO0OO = oooO0O0.f33460OooO0OO;
        this.f33455OooO0Oo = oooO0O0.f33461OooO0Oo;
        this.f33457OooO0o0 = oooO0O0.f33463OooO0o0;
        this.f33456OooO0o = oooO0O0.f33462OooO0o;
    }
}
