# faker
A Java lib to generate fake data for your tests

## Usage

Everything start with the Faker static class. Then, you just have to follow the builder pattern

## Samples

### Simple strings

Faker.simpleString().build()
> fOEjJ5kQlo

Faker.simpleString().withoutLetters().build()
> 0476606057

Faker.simpleString().withoutNumbers().ofLength(20).build()
> GLVJubwTuUiTjDDzaMTC

### Emails

Faker.email().build()
> john.doe@sample.com

Faker.email().withName("toma", "cla").withDomain("yahoo", "fr").build()
> toma.cla@yahoo.fr

### Phone numbers

Faker.phoneNumber().build()
> 0123456789

Faker.phoneNumber().usa().asInternational().build()
> +1123456789

### Text

Faker.text().build()
> Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam

Faker.text().withWords(30).build()
> Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et

### URL

Faker.url().build()
> http://www.sample.com

Faker.url().withDomain("google", "search", "fr").withPath("/query/search").build()
> http://search.google.fr/query/search

### Integers

Faker.integers().build()
> 755

Faker.integers().between(5, 12).build()
> 8

### Doubles

Faker.doubles().build()
> 524.9670364442469

Faker.doubles().between(5.5, 12.3).build()
> 11.940479275468224





