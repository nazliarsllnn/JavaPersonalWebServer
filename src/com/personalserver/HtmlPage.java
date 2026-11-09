package com.personalserver;

public class HtmlPage implements PageProvider {

    @Override
    public String generatePage() {

        return """
                <!DOCTYPE html>
                <html lang="tr">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Nazlı Arslan - Kişisel Web Sayfası</title>

                    <style>
                        body {
                            background: linear-gradient(135deg, #141e30, #243b55);
                            font-family: Arial, sans-serif;
                            color: white;
                            text-align: center;
                            padding: 80px 20px;
                        }

                        .card {
                            background-color: white;
                            color: #243b55;
                            max-width: 600px;
                            margin: auto;
                            padding: 40px;
                            border-radius: 20px;
                            box-shadow: 0 10px 30px rgba(0,0,0,0.3);
                        }

                        h1 {
                            color: #1565c0;
                            font-size: 36px;
                        }

                        h2 {
                            color: #e67e22;
                            font-size: 24px;
                        }

                        p {
                            font-size: 17px;
                            line-height: 1.8;
                        }

                        .footer {
                            margin-top: 25px;
                            color: #777;
                            font-size: 13px;
                        }
                    </style>
                </head>

                <body>

                    <div class="card">

                        <h1>Nazlı Arslan</h1>

                        <h2>Öğrenci No: 1250505081</h2>

                        <p>
                            Merhaba! Ben Nazlı Arslan.
                            Yazılım Mühendisliği öğrencisiyim.
                            Yazılım geliştirme, Java programlama ve
                            web teknolojileri alanlarına ilgi duyuyorum.
                            Kendimi yazılım alanında geliştirmeyi,
                            yeni teknolojiler öğrenmeyi ve öğrendiklerimi
                            projelere dönüştürmeyi hedefliyorum.
                        </p>

                        <div class="footer">
                            Java Socket Programming ile geliştirilmiştir.
                        </div>

                    </div>

                </body>
                </html>
                """;
    }
}