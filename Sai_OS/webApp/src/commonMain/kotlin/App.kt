import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val Background = Color(0xFF070B14)
private val Card = Color(0xFF111827)
private val Accent = Color(0xFF6EE7F9)
private val AccentSoft = Color(0xFF16343B)
private val TextPrimary = Color(0xFFF8FAFC)
private val TextSecondary = Color(0xFF94A3B8)

@Composable
fun App() {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Background
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(430.dp)
                        .padding(horizontal = 22.dp, vertical = 18.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    StatusBar()
                    Spacer(Modifier.height(34.dp))

                    Text(
                        text = "SAI Voice OS",
                        color = TextPrimary,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(Modifier.height(6.dp))
                    Text(
                        text = "Voice-first computing",
                        color = TextSecondary,
                        fontSize = 15.sp
                    )

                    Spacer(Modifier.height(30.dp))

                    Box(
                        modifier = Modifier
                            .size(156.dp)
                            .background(AccentSoft, CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Box(
                            modifier = Modifier
                                .size(116.dp)
                                .background(Accent, CircleShape),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "🎙",
                                fontSize = 46.sp
                            )
                        }
                    }

                    Spacer(Modifier.height(20.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Box(
                            modifier = Modifier
                                .size(9.dp)
                                .background(Accent, CircleShape)
                        )
                        Spacer(Modifier.width(8.dp))
                        Text(
                            text = "SAI IS READY",
                            color = Accent,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            letterSpacing = 1.2.sp
                        )
                    }

                    Spacer(Modifier.height(12.dp))

                    Text(
                        text = "“Your voice is your interface.”",
                        color = TextSecondary,
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center
                    )

                    Spacer(Modifier.height(30.dp))

                    FeatureCard("🌐", "Web", "Internet access")
                    Spacer(Modifier.height(10.dp))
                    FeatureCard("📄", "Documents", "Read & search files")
                    Spacer(Modifier.height(10.dp))
                    FeatureCard("💻", "Computer", "Local control")
                    Spacer(Modifier.height(10.dp))
                    FeatureCard("♿", "Accessibility", "Voice-first design")

                    Spacer(Modifier.weight(1f))

                    Text(
                        text = "SAI VOICE OS  •  WEB EDITION",
                        color = TextSecondary,
                        fontSize = 11.sp,
                        letterSpacing = 1.1.sp
                    )
                    Spacer(Modifier.height(8.dp))
                }
            }
        }
    }
}

@Composable
private fun StatusBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("9:41", color = TextPrimary, fontSize = 13.sp, fontWeight = FontWeight.SemiBold)
        Text("●  ▮▮▮  100%", color = TextSecondary, fontSize = 11.sp)
    }
}

@Composable
private fun FeatureCard(icon: String, title: String, subtitle: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(62.dp)
            .background(Card, RoundedCornerShape(18.dp))
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(icon, fontSize = 22.sp)
        Spacer(Modifier.width(14.dp))
        Column {
            Text(title, color = TextPrimary, fontSize = 15.sp, fontWeight = FontWeight.SemiBold)
            Text(subtitle, color = TextSecondary, fontSize = 11.sp)
        }
    }
}
