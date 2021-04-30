mod hello_tdd_mod {
    pub fn hello(name: String) -> String {
        let mut s = String::from("Hello ");
        s.push_str(&name);
        return s;
    }
    pub fn symmetric(names: Vec<String>) -> Vec<String> {
        let mut first: Vec<String> = vec![];
        let mut second: Vec<String> = vec![];

        let mut count = 0;
        loop {
            if count % 2 == 0 {
                first.push(String::from(names.get(count).unwrap()));
            } else {
                second.push(String::from(names.get(count).unwrap()));
            }
            count += 1;
            if count >= names.len() {
                break;
            }
        }
        second.reverse();
        first.append(&mut second);
        return first;
    }
}

#[cfg(test)]
mod tests {
    use super::hello_tdd_mod;

    #[test]
    fn test_hello() -> Result<(), String> {

        let mut test: Vec<&str> = Vec::new();
        test.push("Bo");

        let mut names3: Vec<String> = Vec::new();
        names3.push(String::from("Bo"));
        names3.push(String::from("Pat"));
        names3.push(String::from("Jean"));
        names3.push(String::from("Kevin"));
        names3.push(String::from("Claude"));
        names3.push(String::from("William"));
        names3.push(String::from("Marybeth"));
        let mut names3_result: Vec<String> = Vec::new();
        names3_result.push(String::from("Bo"));
        names3_result.push(String::from("Jean"));
        names3_result.push(String::from("Claude"));
        names3_result.push(String::from("Marybeth"));
        names3_result.push(String::from("William"));
        names3_result.push(String::from("Kevin"));
        names3_result.push(String::from("Pat"));

        assert_eq!(hello_tdd_mod::symmetric(names3), names3_result);
        Ok(())
    }
}

fn main() {
    let a = hello_tdd_mod::hello(String::from("gurra"));
    println!("{}", a)
}
